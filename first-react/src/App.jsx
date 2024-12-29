import Header from "./Header";

function MainComponent() {
  return (
    <main>
      <h1>Reasons</h1>
      <ol>
        <li>reason1</li>
        <li>reason2</li>
        <li>reason3</li>
      </ol>
    </main>
  );
}

function Footer() {
  return (
    <footer>
      <small>copyright</small>
    </footer>
  );
}

function App() {
  return (
    <>
      <Header />
      <MainComponent />
      <Footer />
    </>
  );
}

export default App;
