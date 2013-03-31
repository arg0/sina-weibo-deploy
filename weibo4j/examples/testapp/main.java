package testapp;

import weibo4j.Timeline;
import weibo4j.Weibo;
import weibo4j.http.AccessToken;
import weibo4j.model.Status;
import weibo4j.model.WeiboException;

public class main {
	public static void main(String[] args) throws WeiboException {
		// TODO Auto-generated method stub
		Weibo weibo = new Weibo();
		String access_token = "2.00fXNMxBW2d72D9ad69f14adBQcGnC";
		String id = "2609855497";
		weibo.setToken(access_token);
		Timeline tm = new Timeline();
		Status status = tm.UpdateStatus("哈哈~~");// 自己所发的微博内容，不超过140个字！
	}
}
