import { Button, message, ConfigProvider, theme } from "antd";
import { logout } from "../utils";
import React from "react";

class Logout extends React.Component {
  logoutOnClick = () => {
    logout()
      .then(() => {
        message.success("log in succeeded");
        this.props.onSuccess();
      })
      .catch((err) => {
        message.error("something went wrong");
      });
  };

  render = () => {
    return (
      <Button shape="round" type="primary" onClick={this.logoutOnClick}>
        Logout
      </Button>
    );
  };
}

export default Logout;
