import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1>Ola Mundo!</h1>

        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
