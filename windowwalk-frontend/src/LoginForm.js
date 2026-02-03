import { Button, Form, Input, message } from "antd";
import React from "react";
import { LockOutlined, UserOutlined } from "@ant-design/icons";
import { login } from "../utils";

class LoginForm extends React.Component {
  state = {
    loading: false,
  };

  onFinish = (data) => {
    this.setState({
      loading: true,
    });

    login(data)
      .then(() => {
        message.success("log in succeeded");
        this.props.onSuccess();
      })
      .catch((err) => {
        message.error("something went wrong");
      })
      .finally(() => {
        this.setState({ loading: false });
      });
  };

  render() {
    return (
      <Form
        name="normal_login"
        onFinish={this.onFinish}
        style={{ width: 300, margin: "auto" }}
      >
        <Form.Item
          name="username"
          rules={[{ required: true, message: "Please input your username" }]}
        >
          <Input prefix={<UserOutlined />} placeholder="Username" />
        </Form.Item>
        <Form.Item
          name="password"
          rules={[{ required: true, message: "Please input your password" }]}
        >
          <Input.Password prefix={<LockOutlined />} placeholder="Password" />
        </Form.Item>

        <Form.Item>
          <Button type="primary" htmlType="submit" loading={this.state.loading}>
            Login
          </Button>
        </Form.Item>
      </Form>
    );
  }
}
export default LoginForm;
