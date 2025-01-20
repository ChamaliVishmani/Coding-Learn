import random
import threading
import time

class Philosopher(threading.Thread):

    def __init__(self,name,leftFork,rightFork):
        print("{} has sat on the table".format(name))
        threading.Thread.__init__(self, name=name)
        self.leftFork=leftFork
        self.rightFork=rightFork

    def run(self):
        print("{} has started thinking".format(threading.current_thread().name))
        while True:
            time.sleep(random.randint(1,5))
            print("{} has finished thinking".format(threading.current_thread().name))
            self.leftFork.acquire()
            time.sleep(random.randint(1,5))
            try:
                print("{} has acquired the left fork".format(threading.current_thread().name))
                self.rightFork.acquire()
                try:
                    print("{} has acquired the both forks, currently eating".format(threading.current_thread().name))
                finally:
                    self.rightFork.release()
                    print("{} has released the right fork".format(threading.current_thread().name))
            finally:
                self.leftFork.release()
                print("{} has released the left fork".format(threading.current_thread().name))


fork1 = threading.RLock()
fork2 = threading.RLock()
fork3 = threading.RLock()
fork4 = threading.RLock()
fork5 = threading.RLock()

philosopher1 = Philosopher("philosopher1",fork1,fork2)
philosopher2 = Philosopher("philosopher2",fork2,fork3)
philosopher3 = Philosopher("philosopher3",fork3,fork4)
philosopher4 = Philosopher("philosopher4",fork4,fork5)
philosopher5 = Philosopher("philosopher5",fork5,fork1)

philosopher1.start()
philosopher2.start()
philosopher3.start()
philosopher4.start()
philosopher5.start()

philosopher1.join()
philosopher2.join()
philosopher3.join()
philosopher4.join()
philosopher5.join()

