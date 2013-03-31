package weibo4j.examples.friendships;

import weibo4j.Friendships;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.WeiboException;

public class GetFriendsIds {

	public static void main(String[] args) {
/*		String access_token = args[0];
		String uid = args[1];*/
		String access_token = "2.00fXNMxBW2d72D9ad69f14adBQcGnC";
		String uid = "2609855497";
		Friendships fm = new Friendships();
		fm.client.setToken(access_token);
		try {
			String[] ids = fm.getFriendsIdsByUid(uid);
			for(String s : ids){
				Log.logInfo(s);
			}
		} catch (WeiboException e) {
			e.printStackTrace();
		}

	}

}
