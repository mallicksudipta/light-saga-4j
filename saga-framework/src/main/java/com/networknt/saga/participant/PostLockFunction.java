package com.networknt.saga.participant;


import com.networknt.saga.common.LockTarget;
import com.networknt.tram.command.consumer.CommandMessage;
import com.networknt.tram.command.consumer.PathVariables;
import com.networknt.tram.message.common.Message;

public interface PostLockFunction<C> {

  public LockTarget apply(CommandMessage<C> cm, PathVariables pvs, Message reply);
}
