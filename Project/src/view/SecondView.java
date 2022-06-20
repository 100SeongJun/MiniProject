package view;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class SecondView {
	public static void secondView(int startNum, Scanner sc) throws NoSuchElementException {
		StudentView studentV = StudentView.getInstance();
		InstructorView instructorV = InstructorView.getInstance();
		ManagerView managerV = ManagerView.getInstance();
		CourseView courseV = CourseView.getInstance();
		switch (startNum) {
		case 1: // 모든 정보 출력
			System.out.println("┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃            AllPeople              ┃");
			System.out.println("┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
			System.out.println("┃1.    학생의 모든 정보 출력              	    ┃");
			System.out.println("┃2.    강사의 모든 정보 출력	       	    ┃");
			System.out.println("┃3.    담당자 모든 정보 출력	       	    ┃");
			System.out.println("┃4.    강의 모든 정보 출력	            ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				studentV.allPeople();
				break;
			case 2:
				instructorV.allPeople();
				break;
			case 3:
				managerV.allPeople();
				break;
			case 4:
				courseV.allCourse();
			}
			break;

		case 2: // 특정 정보 검색
			System.out.println("┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃            특정 정보 검색             	    ┃");
			System.out.println("┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
			System.out.println("┃1.        학생 정보 출력              	    ┃");
			System.out.println("┃2.        강사 정보 출력	       	    ┃");
			System.out.println("┃3.        담당 정보 출력	       	    ┃");
			System.out.println("┃4.        강의 정보 출력	            ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			int second = sc.nextInt();
			switch (second) {
			case 1:
				studentV.selectView(sc);
				break;
			case 2:
				instructorV.selectView(sc);
				break;
			case 3:
				managerV.selectView(sc);
				break;
			case 4:
				courseV.selectView(sc);
				break;

			default:
				System.out.println("입력값이 잘못되었습니다.\n");
			}
			break;

		case 3: // 특정 정보 업데이트
			System.out.println("┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃          특정 정보 업데이트          	    ┃");
			System.out.println("┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
			System.out.println("┃1.        학생 정보 업데이트              	    ┃");
			System.out.println("┃2.        강사 정보 업데이트	       	    ┃");
			System.out.println("┃3.        담당 정보 업데이트	       	    ┃");
			System.out.println("┃4.        강의 정보 업데이트	            ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			int third = sc.nextInt();
			switch (third) {
			case 1: // 학생 정보 업데이트
				studentV.updateView(sc);
				break;
			case 2: // 강사 정보 업데이트
				instructorV.updateView(sc);
				break;
			case 3: // 매니저 정보 업데이트
				managerV.updateView(sc);
				break;

			case 4: // 강의 정보 업데이트
				courseV.updateView(sc);
				break;
			case 5: // 출결 업데이트
				studentV.updateSalary(sc);
				break;
			default:
				System.out.println("입력값이 잘못되었습니다.");
			}
			break;

		case 4: // 급여정보
			studentV.searchSalary(sc);
			break;

		case 5: // 정보 추가
			System.out.println("┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃           특정 정보 추가                 	   ┃");
			System.out.println("┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
			System.out.println("┃1.         학생 정보 추가              	   ┃");
			System.out.println("┃2.         강사 정보 추가	       	   ┃");
			System.out.println("┃3.         담당 정보 추가	       	   ┃");
			System.out.println("┃4.         강의 정보 추가	           ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			int insert = sc.nextInt();
			switch (insert) {
			case 1: // 학생 정보 추가
				studentV.insertView(sc);
				break;
			case 2: // 강사 정보 추가
				instructorV.insertView(sc);
				break;
			case 3: // 매니저 정보 추가
				managerV.insertView(sc);
				break;
			case 4: // 강의 정보 추가
				courseV.insertView(sc);
				break;
			default:
				System.out.println("입력값이 잘못되었습니다.");

			}
			break;
		case 6:
			System.out.println("┎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃           특정 정보 삭제                 	    ┃");
			System.out.println("┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
			System.out.println("┃1.         학생 정보 삭제              	    ┃");
			System.out.println("┃2.         강사 정보 삭제	       	    ┃");
			System.out.println("┃3.         담당 정보 삭제	       	    ┃");
			System.out.println("┃4.         강의 정보 삭제	            ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			int delete = sc.nextInt();
			switch (delete) {
			case 1: // 학생 정보 삭제
				studentV.deleteView(sc);
				break;
			case 2: // 강사 정보 삭제
				instructorV.deleteView(sc);
				break;
			case 3: // 담당자 정보 삭제
				managerV.deleteView(sc);
				break;
			case 4: // 강의 정보 삭제
				sc.reset();
				courseV.deleteView(sc);
				break;
			default:
				System.out.println("입력값이 잘못되었습니다.");
			}
			break;
		default:
			System.out.println("입력값이 잘못되었습니다.");
		}
	}
}
