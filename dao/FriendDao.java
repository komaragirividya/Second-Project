package com.niit.chat.dao;

import java.util.List;

import com.niit.chat.model.Friend;

public interface FriendDao 
{
		List<Friend> getAllFriends(String username);
		public void sendFriendRequest(String from,String to);
		List<Friend> getPendingRequest(String username);
		public void updatePendingRequest(char friendStatus,String fromId,String toId);
		

}
