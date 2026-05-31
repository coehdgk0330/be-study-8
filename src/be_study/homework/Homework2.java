package be_study.homework;

class Person {
    String name;
    int age;
    
   public void hello() {
        System.out.println("저는 " + name + "이고, " + age + "살입니다.");
    }
}

public class Homework2 {

	public static void main(String[] args) {
		
		
		// 11. Person 객체 하나를 만들어 name과 age를 설정하고 출력하라.	
		Person p1 = new Person();
		p1.name = "채동하";
		p1.age = 25;
		System.out.println("이름 = "+ p1.name + ", 나이 = "+ p1.age);
		
		// 12. Person 객체를 생성해 hello() 메서드를 실행해보라.
		p1.hello();
		
		// 13. Person 객체를 매개변수로 받아 name을 출력하는 메서드를 만들어라.
		printName(p1);
		
		// 14. Person 객체를 리턴하는 메서드를 작성하라(name과 age 세팅 후 리턴).
		Person p2= createPerson("채동하", 25);
		System.out.println(p2.name +  "(" + p2.age+")");
		
		// 15. Person 두 명을 만들어 age가 큰 사람을 출력하라.
		if(p1.age > p2.age) {
			System.out.println(p1.name);
		}else if (p2.age > p1.age) {
			System.out.println(p2.name);
		}else {
			System.out.println("같은나이");
		}
		
		// 16. Person 객체를 매개변수로 받아 age를 1 증가시키는 메서드를 작성하라. (원본 확인)
		System.out.println("증가 전 나이 : "+p1.age);
		increase(p1);
		System.out.println("증가 후 나이 : "+p1.age);
		
		// 17. Person을 만들고, 그 객체의 참조를 두 변수에 나눠 담은 뒤 값 변경 테스트를 해보라.
		
		// 18. Person 배열을 만들어 3명을 채워 넣고 이름을 출력하라.
		Person []people = new Person[3];
		people[0]=createPerson("홍길일",27);
		people[1]=createPerson("홍길이",22);
		people[2]=createPerson("홍길삼",32);
		
		for(int i=0; i<people.length; i++) {
			System.out.println(people[i].name+ " ");
		}
		
		// 19. Person 배열을 매개변수로 받아 모든 사람의 hello()를 호출하라.
		helloAll(people);
		
		// 20. Person 배열을 만들어 가장 나이가 많은 사람을 리턴하는 메서드를 작성하라.
		Person oldest = getOldestPerson(people);
		System.out.println(oldest.name +"("+ oldest.age+")");
		
		//25. Person을 생성해서 배열 인덱스 0에 넣는 방법을 코드로 작성하라.
		Person[]box = new Person[3];
		box[0]=new Person();
		box[0].name="이름";
		box[0].age=33;
				
		nullPerson(people);
		
	}

	//13번 메소드
	public static void printName(Person p) {
	 System.out.println(p.name);
	}
	// 14번 메서드
	public static Person createPerson(String name, int age) {
		Person p =new Person();
		p.name = name;
		p.age = age;
		return p;
	}
	//16번 메서드
	public static void  increase(Person p) {
		p.age++;
	}
	//19번 메서드
	public static void helloAll(Person[]arr) {
		for(Person p : arr) {
			p.hello();
		}
	}
	//20번 메서드
	public static Person getOldestPerson(Person[]arr) {
		Person maxAgePerson = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i].age > maxAgePerson.age) {
				maxAgePerson = arr[i];
			}
		}
		return maxAgePerson;
	}


//21. 길이를 입력받아 Person 배열을 생성해 리턴하는 메서드를 작성하라.
	public static  Person[]createPersonArray(int length){
		Person[]arr = new Person[length];
		return arr;
	}
//22. Person 배열에 대해 모든 사람의 나이를 합산하는 메서드를 작성하라.
	public static int sumAges(Person[]arr) {
		int totalSum=0;
		for(int i=0; i<arr.length; i++) {
			totalSum +=arr[i].age;
			
		}
		return totalSum;
	}
//23. Person 배열을 전달하면, 모든 나이를 10으로 초기화하는 메서드를 만들어라.
	public static void resetAge(Person[]arr) {
		for(int i =0; i<arr.length; i++) {
			arr[i].age=10;
			
		}
	}
	
//24. Person 배열의 name만 따로 String[] 에 담아 리턴하는 메서드를 작성하라.
	public static String[] separatelyName(Person[]arr) {
		String[]nameArray = new String[arr.length];
		
		for(int i =0; i<arr.length; i++) {
			nameArray[i] = arr[i].name;
		}
		return nameArray;
	}
	
//25. Person을 생성해서 배열 인덱스 0에 넣는 방법을 코드로 작성하라.
	// 메인 메소드 작성
//26. Person 배열 일부 요소는 null일 때, null 검사를 하며 출력하는 코드를 작성하라.
	public static void nullPerson(Person[]arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
				System.out.println(i + ": " + arr[i].name);
			}else {
				System.out.println(i);
			}
			
		}
	}
//27. 이름으로 Person을 검색하여 해당 객체를 리턴하는 메서드를 작성하라.
	public static Person findPerson(Person[] arr, String target) {
	    for (int i = 0; i < arr.length; i++) {
	       
	        if (arr[i] != null && arr[i].name.equals(target)) {
	            return arr[i]; 
	        }
	    }
	    return null; 
	}
//28. Person 배열을 생성하되, 짝수 인덱스에만 객체를 넣고 나머지는 null로 두어라.
	public static Person[]createEven(){
		Person[] list = new Person[4];
		
		for (int i=0; i<list.length; i++) {
			if (i%2==0) {
				list[i]= new Person();
				list[i].name= i+ " ";
			}
			
		}
		return list;
	}
//29. Person을 전달받아 새로운 Person을 만들어 반환하되, name만 복사해라.
	public static Person CopyName(Person P) {
		Person clone = new Person();
		clone.name = P.name;
		return clone;
	}
//30. Person 배열을 전달받아, age가 30 이상인 사람만 새로운 배열로 리턴하라.
	public static Person[] overThirty(Person[]arr) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] !=null && arr[i].age>30) {
				count++;
			}
		}
		Person[] adult = new Person[count];
		
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null && arr[i].age>=30) {
				adult[index]= arr[i];
				index++;
						
			}
			
		}
		return adult;
	}
	}


