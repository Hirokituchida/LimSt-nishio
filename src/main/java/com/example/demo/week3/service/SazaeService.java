package com.example.demo.week3.service;

import org.springframework.stereotype.Service;

@Service
public class SazaeService {
    /**
     * <pre>
     * 【問題文】
     * jankenは、引数の myHand(自分の手) とopponentHand(相手の手)を使用して、
     * じゃんけんの勝敗を取得するメソッドです。 
     * ・じゃんけんの勝敗(win,lose,drawの何れか)を取得する処理を記載してください。
     * ・じゃんけんの勝敗は変数resultに格納して返却してください。
     * 例：
     * myHand = "goo", opponentHand = "choki"
     * return "win"
     * </pre>
     *
     * @param myHand 自分の手 goo,choki,per のいずれかの文字列
     * @param opponentHand 相手の手 goo,choki,per のいずれかの文字列
     * @return result win,lose,draw のいずれかの文字列
     * @throws IllegalArgumentException myHand または opponentHand が goo,choki,per のいずれかでない場合
     */
    public String janken(String myHand, String opponentHand) {
    	String result;
    	if(myHand.equals(opponentHand)) {
    		result="draw";
    	}else if(myHand.equals("goo")&&opponentHand.equals("choki")) {
    		result="win";
    	}else if(myHand.equals("goo")&&opponentHand.equals("per")){
    		result="lose";
    	}else if(myHand.equals("choki")&&opponentHand.equals("goo")) {
    		result="lose";
    	}else if(myHand.equals("choki")&&opponentHand.equals("per")) {
    		result="win";
    	}else if(myHand.equals("per")&&opponentHand.equals("choki")) {
    		result="lose";
    	}else {
    		result="win";
    	}
    	return result;

    }
}
