package com.niit.chat.controller;

import java.util.Date;


import org.slf4j.*;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.niit.chat.model.Message;
import com.niit.chat.model.OutputMessage;

@Controller
@RequestMapping("/")
public class ChatController {

  private Logger logger = LoggerFactory.getLogger(getClass());

  @MessageMapping("/chat")  /*through which path msg can be sent*/
  @SendTo("/topic/message")  /* where the msg will be passed to*/
  public OutputMessage sendMessage(Message message) {
    logger.info("Message sent");
    return new OutputMessage(message ,new Date());
  }
  /*//added
  @MessageMapping("/chat")  through which path msg can be sent
  @SendToUser("/queue/message")   where the msg will be passed to
  public OutputMessage sendPrivateMessage(Message message) {
    logger.info("Message sent");
    return new OutputMessage(message ,new Date());
  }*/
}
