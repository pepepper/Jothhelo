package JOthhelo;

import JOthhelo.boards;

import java.util.Random;

public class game{
	private boards board;
	private boolean full = false;
	private int howturn = 0, b, w, turn = -1;
	
	game(){
		Random random = new Random();
		board = new boards(random.nextInt(5) + 4, random.nextInt(5) + 4);
		
	}
	
	game(int x, int y){
		board = new boards(x * 2, y * 2);
	}
	
	boolean put(int x, int y){
		
		if(board.Put(x, y, turn)){
			turn *= -1;
			howturn++;
			full = board.isFull(turn);
			tuple koma = board.Count();
			canPass();
			if(koma.a == 0 || koma.b == 0)
				full = true;
			return true;
		}
		return false;
	}
	
	boolean put(int x, int y, int freeput){
		
		if(board.freeput(x, y, turn)){
			turn *= -1;
			howturn++;
			full = board.isFull(turn);
			tuple koma = board.Count();
			canPass();
			if(koma.a == 0 || koma.b == 0)
				full = true;
			return true;
		}
		return false;
	}
	
	private void canPass(){
		for(int x = 0; x < 16; x++){
			for(int y = 0; y < 16; y++){
				if(board.isPutable(x, y, turn))
					return;
			}
		}
		turn *= -1;
	}
}
