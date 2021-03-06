package com.chachae.webrtc.constant;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/14 13:15
 */
public interface MessageConstant {

  String COMMAND_SEND_GROUP = "send::message::group";
  String COMMAND_SEND_ONE = "send::message::one";
  String COMMAND_SEND_CMD = "cmd";
  String TYPE_COMMAND_HEART = "heart";
  String TYPE_COMMAND_OFFER = "offer";
  String TYPE_COMMAND_ANSWER = "answer";
  String TYPE_COMMAND_CANDIDATE = "candidate";
}
