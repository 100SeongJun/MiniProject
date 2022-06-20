package view;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class StartView {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				// ━┎┃┗ ┓┠┠┛ ┫
				System.out.println("┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("┃            MiniProject            ┃");
				System.out.println("┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
				System.out.println("┃ 1. 모든정보 출력	2. 검색	3. 수정	    ┃");
				System.out.println("┃ 4. 교육비 출력 	5. 추가	6. 삭제	    ┃");
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				int num = sc.nextInt();
				if (num < 0) {
					System.out.println("종료");
					sc.close();
					break;
				}
				SecondView.secondView(num, sc);
			} catch (NoSuchElementException e) {
				System.out.println("입력값이 잘못되었습니다.\n");
			} finally {
				sc.reset();
			}
		}
	}
}
