def index_of_item(collection, target):
    for i in range(0, len(collection)):
        if target == collection[i]:
            return i
    return None


numbers = [x for x in range(1, 11)]
result = index_of_item(numbers, 4)
print(result)
