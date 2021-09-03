package controller;

import java.util.Scanner;

import action.Action;

//사용자의 요청을 제어하는 클래스
public class IdolGroupController {
   public void processRequest(Action action, Scanner scanner ) throws Exception {//요청을 받아서 처리하는 메소드 processRequest
	   action.execute(scanner);//execute 으로 인해 다형성이 형성됨. 각각 요청에 맞게 요청클래스에 맞는 게 불러와지게 된다. 
	   
   }
}
