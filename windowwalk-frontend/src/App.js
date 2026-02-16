import logo from "./logo.svg";
import "./App.css";
// import { Content } from "antd/lib/layout/layout";
import { Layout, Typography } from "antd";
import { useState } from "react";
import LoginForm from "./components/LoginForm";

const { Header, Content } = Layout;
const { Title } = Typography;

// start with: NODE_OPTIONS=--openssl-legacy-provider npm start

const App = () => {
  const [authed, setAuthed] = useState(false);
  return (
    <Layout style={{ height: "100vh" }}>
      <Header style={{ color: "white" }}>
        <div className="header">
          <Title
            level={2}
            style={{ color: "white", lineHeight: "inherit", marginBottom: 0 }}
          >
            WindowWalk
          </Title>
        </div>
      </Header>
      <Content
        style={{
          padding: "50px",
          maxHeight: "calc(100% - 64px)",
          overflowY: "auto",
        }}
      >
        {authed ? (
          <div>content placeholder</div>
        ) : (
          <LoginForm onSuccess={() => setAuthed(true)} />
        )}
      </Content>
    </Layout>
  );
};

export default App;
