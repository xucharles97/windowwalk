import logo from "./logo.svg";
import "./App.css";
// import { Content } from "antd/lib/layout/layout";
import { Layout } from "antd";

const { Header, Content } = Layout;

// start with: NODE_OPTIONS=--openssl-legacy-provider npm start

const App = () => {
  return (
    <Layout style={{ height: "100vh" }}>
      <Header style={{ color: "white" }}>header</Header>
      <Content
        style={{
          padding: "50px",
          maxHeight: "calc(100% - 64px)",
          overflowY: "auto",
        }}
      >
        content
      </Content>
    </Layout>
  );
};

export default App;
