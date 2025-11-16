//1) allocate memory for 1 int and store 420 value inside.now release it.
//allocate memory for 10 characters on heap store 10 characters, display them and
// release th.at memory.

//#include <iostream>
//using namespace std;
//int main() {
//	int m = 420;
//	cout << m << endl;
//	
//	char  *arr = new char[10];
//	for (int i = 0;i < 9;i++) {
//		arr[i] = 'a' + i;
//	}
//	arr[9] = '\0';  //null pointer terminator
//
//	cout << "character array ;" << arr << endl;
//
//	delete[] arr;
//	arr = nullptr;
//	return 0;
//
//    
//
//
//}








//
//2) define a class to meet following requirements
//First f1("hello", "welcome");    f1.disp                   //only use characters
//First f2 = f1;			f2.disp  
//First f3;
//f3 = f1				f3.disp
//make sure neither memory leak nor dangling pointer arises in the code



//#include <iostream>
//#include <cstring> 
//using namespace std;
//class First {                                       //char name[] = "Hello"; char* p = name;
//	char* s;
//	char* t;
//
//
//
//public:
//	First():s(nullptr),t(nullptr) {
//		
//		cout << "Default Constructor" << endl;
//	}
//
//	First(const char* s,const char* t) {
//		/*Param constructor accepts const char* (so string literals work)*/
//		this->s = new char[strlen(s) + 1];
//		strcpy_s(this->s, strlen(s) + 1, s);
//		this->t = new char[strlen(t) + 1];
//		strcpy_s(this->t, strlen(t) + 1, t);
//
//
//	}
//	First(const First& ref) {          //We should not change the object being copied const guarantees safety
//		cout << "Copy Constructor" << endl;
//		s = new char[strlen(ref.s) + 1]; 
//		strcpy_s(s, strlen(ref.s) + 1, ref.s);  //strcpy_s(dest, destSize, src)
//		t = new char[strlen(ref.t) + 1];
//		strcpy_s(t, strlen(ref.t) + 1, ref.t);
//	}
//
//	First& operator=(First& ref) {
//		cout << " = operator overloading" << endl;
//		s = new char[strlen(ref.s) + 1];
//		strcpy_s(s,strlen(ref.s)+1,ref.s);
//		t = new char[strlen(ref.t)+1];
//		strcpy_s(t, strlen(ref.t) + 1, ref.t);
//		return *this;
//
//	}
//	
//	~First() {
//		cout << "Destructor called" << endl;
//		delete[] s;
//		s = nullptr;
//
//		delete[] t;
//		t = nullptr;
//	}
//
//	  void disp() const{
//		cout << s << "\n" << t << endl;
//	}
//
//
//};
//
//
//
//
//
//int main() {
//	First f1("hello", "welcome");
//	f1.disp();
//	First f2 = f1;		// This calls the copy constructor Because f2 is being created and initialized with another object.
//	f2.disp();
//	First f3;
//	f3 = f1; //f3.operator=(f1) /* This does NOT call copy constructor .It calls copy assignment operator (operator=).Because object f3 already exists, and now it's being assigned.*/
//	f3.disp();
//
//	return 0;
//}
//
//hello
//welcome
//Copy Constructor
//hello
//welcome
//Default Constructor
//= operator overloading
//hello
//welcome
//Destructor called
//Destructor called
//Destructor called



//3) define a class “Voter”, its members should be int id, char* name, char* address.
//Define input(), show() methods
//
//Accept from user, how many voters he has.
//[DMA]				Depending upon that, allocate the memory, invoke input() and get the data from user.
//Now invoke show method for all the objects created.make sure neither memory leak nor dangling pointer arises in the code

//#include<iostream>
//#include <cstring>
//using namespace std;
//
//class Voter {
//	int id;
//	char* name;
//	char* address;
//public:
//	Voter() {
//		cout << "Default Constructor" << endl;
//		id = 0;
//		name = new char[100];
//
//		address = new char[100];
//	}
//	
//	~Voter() {
//		cout << "Destructor Called" << endl;
//		delete[] name;
//		delete[] address;
//	}
//	void input() {
//		cout << "Enter Voter id" << endl;
//		cin >> id;
//		cin.ignore();
//		cout << "Enter name" << endl;
//		cin.getline(name, 100);
//		cout << "Enter address" << endl;
//		cin.getline(address,100);
//	}
//	void show() {
//		cout << "Voter Details are:-" << endl;
//		cout << id << "\t" << name << "\n" << address << endl;
//
//	}
//};
//int main() {
//	int size;
//	cout << "Enter no of voter the user has" << endl;
//	cin >> size;
//	Voter* v = new Voter[size];
//	for (int i = 0;i < size;i++) {
//		v[i].input();
//
//	}
//
//	for (int i = 0;i < size;i++) {
//		v[i].show();
//
//	}
//		
//	delete[] v;
//
//}




//4) Sample s1(10)
//
//s1 - 300
//
//s1 = 600
//
//int data = s1
//s1 + s2
//++s1
//s1++
//s1 += 20
//100 + s1
//
//cin >> s1
//cout << s1




//When to return *this (i.e., return Sample&)
//
//Use this when the operator modifies the current object and should allow chaining without making a copy.
//
//Assignment - like operators :
//
//Sample & operator=(int k) → modify num, then return *this;
//
//Sample& operator+=(int m) → modify num, then return *this;
//
//Prefix increment :
//
//Sample & operator++() → increment, then return *this;

//We modified the same existing object(not a new one)


//#include <iostream>
//using namespace std;
//class Sample {
//	int num ;
//public:
//	Sample() { 
//		
//		cout << "Default Constructor" << endl;
//	}
//	Sample(int l) {
//		num = l;
//	}
//
//
//	void display() {
//		cout << num << endl;
//	}
//	Sample  operator-(int k) {
//		 return Sample( num - k);
//	}
//
//	Sample& operator=(int k) {
//		 num=k;
//     return *this;
//	}
//	Sample operator+( const Sample & ref) {
//		return Sample( num + ref.num);
//	}
//	Sample& operator+=(int k){
//	    num += k;
//		return *this;
//
//    }
//
//	Sample& operator++() { //prefix
//	     num++;
//		return *this;
//	}
//
//	Sample operator++(int) {    //postfix
//		return Sample(num++);
//	}
//
//
//
//
//	friend Sample operator+(int k,const  Sample & ref);
//	friend ostream& operator<<(ostream  &ref1,const Sample &ref2);
//
//	friend istream& operator>>(istream  &ref4, Sample &ref5);
//	operator int() {    //int data = s1; 
//		return num;
//	}
//	             
//
//};
//
//Sample operator+(int k,const  Sample& ref) {    // s4= 100 + s1; //operator+(int k,Sample&m1);
//	return Sample(k + ref.num);
//}
//
//
//ostream& operator<<(ostream& ref1,const Sample& ref2) {  //cout << s1;
//	 ref1 << ref2.num;
//	 return ref1;
//}
//
//istream& operator>>(istream& ref4, Sample& ref5) {
//	ref4 >> ref5.num;
//	return ref4;
//}
//int main() {
//	Sample s1(300),s2(100),s4;
//
//		s1=s1 - 30;//s1.operator-(300);
//		s1.display();
//		
//	    s1 = 600; //s1.operator=(600);
//		s1.display();
//		
//		int data = s1; //operator int (){return num;}
//		cout << data << endl;
//		Sample s3= s1 + s2;
//		 s3.display();
//		++s1;
//		s1.display();
//		s1++;
//		s1.display();
//		s1 += 20; //
//		s1.display();
//	    s4= 100 + s1; //operator+(int k,Sample&m1);
//		s4.display();
//		cin >> s1;//operator
//
//		cout << s1;
//
//}


//s/*ol:-Default Constructor
//270
//600
//600
//700
//601
//602
//622
//722*/






//5) RTTI
//virtual or pure virtual function
//collect child class addresses in parent pointer, child class object in parent reference, array of parent pointers storing addresses of child classes
//dynamic_cast


//#include <iostream>
//using namespace std;
//class RTTI {
//public:
//	//virtual or pure virtual function
//	virtual void fun() = 0;
//	virtual ~RTTI(){
//
//	}
// 
//};
////
//class A :public RTTI {
//public:
//	void fun() {
//		cout << "Fun at A" << endl;
//	}
//	void special() {
//		cout << " Special Fun at A" << endl;
//	}
//
//};
//
//class B :public RTTI {
//public:
//	void fun() {
//		cout << "Fun at B" << endl;
//	}
//
//};
//
//int main() {
//	RTTI *r=new A ;
//	r->fun();
//
//	
//
//	RTTI* arr[3];
//	arr[0] = new A;
//	arr[1]= new B;
//	arr[2] = new B; 
//	for (int i = 0;i < 3;i++) {         //Array of Parent Pointers
//		arr[i]->fun();
//		A* ptr = dynamic_cast<A*>(arr[i]);   // Use dynamic_cast to detect actual type at runtime
//	
//		if (ptr) {
//			
//			ptr->special();
//		}
//		else {
//			cout << "Not an object of class A" << endl;
//		}
//
//
//	}
//	A a;       //child class object in parent reference
//	RTTI& ref = a;
//	ref.fun();
//
//	for (int i = 0;i < 3;i++) {
//		delete arr[i];
//	}
//	delete r;  /* for r in topmost:*/
//	return 0;
//
//}

//output:-Fun at A
//Fun at A
//Special Fun at A
//Fun at B
//Not an object of class A
//Fun at B
//Not an object of class A
//Fun at A






//6)
//
//class B
//	int y;
//	void disp2() { how will you access "x" here ? }
//
//	class A
//		int x;
//	void disp1() {}
//
//	do not change the order of above classes
// 


//#include <iostream>
//using namespace std;
//class A;
//class B {
//	int y=5;
//public:
//	void disp2(A& ref);
//};
//
//class A {
//	int x=10;
//public:
//	void disp1() {
//		cout << x << endl;
//	}
//	 friend void B:: disp2(A& ref);
//};
//void B::disp2(A& ref) {
//	cout << ref.x + y << endl;
//}
//
//
//int main() {
//	A a;
//	B b;
//	b.disp2(a);
//
//}

//output:- 15








//		7) Given
//
//		class A
//	{
//	private:
//		int* ptr;  // allocate memory inside heap
//		int len;
//		void disp() {  // incomplete }   
//		};
//
//		while creating object of above class pass int array and its length
//			make sure when you call disp, it should display the whole array which was passed while creating array
//			also make sure you can perform following operations on the objects of class A
//			cout << ref1[1];  // ref1 is assumed to be the object of A
//		ref1[0] = 1000;



//#include <iostream>
//using namespace std;
//	class A
//	{
//	  private:
//		int* ptr;  // allocate memory inside heap
//		int len;
//	public:
//		A(int* arr, int n) {
//			len = n;
//			ptr = new int[len];
//			for (int i = 0;i<len;i++) {
//				ptr[i] = arr[i];
//			}
//		}
//		int& operator[](int index) {
//			return ptr[index];
//
//		}
//		~A() {
//			delete[] ptr;
//
//		
//		}
//		void disp() { 
//			for (int i=0;i<len;i++){
//				cout << ptr[i] << endl;
//			}
//		}   
//	};
//
//	int main() {
//		int arr[] = { 1,2,3,4 };
//		A ref(arr,4);
//		ref.disp();
//		cout << ref[1] << endl;
//		ref[0] = 1000;
//		ref.disp();
//	
//
//	}



//		8) show call by value method and prove that original value inside main does not get changed
// 
// 

//#include <iostream>
//using namespace std;
// void check(int m, int n) {
//	int temp = m;
//	m = n;
//	n = temp;
//    
//}
//int main() {
//	int a , b;
//	cout << "Enter the two values:-"<<endl;
//	cin >> a >> b;
//	
//	cout <<"Original value of a is:"<< a<<endl <<"Original value of b is:"<< b << endl;
//	check(a, b);
//	cout <<"New value of a is :"<< a <<endl<<"New value of b is:"<< b << endl;
//	return  0;
//	
//}











//		9) show call by address method and prove that original value inside main gets changed

//#include <iostream>
//using namespace std;
//void check(int *m, int *n) {
//	int temp = *m;
//	*m = *n;
//	*n = temp;
//
//}
//int main() {
//	int a,b;
//	int* a1 = &a;
//	int* b2 = &b;
//	cout << "Enter the two values" << endl;
//	cin >> a >> b;
//	cout << "Original value of a is:" << a << endl << "Original value of b is:" << b << endl;
//	check(a1,b2);
//	cout << "New value of a is :" << a << endl << "New value of b is:" << b << endl;
//	return 0;
//
//
//}











//		10) show call by reference method and prove that original value inside main gets changed
// 

//#include <iostream>
//using namespace std;
//void check(int &m,int &n) {
//
//	int temp = m;
//	m = n;
//	n = temp;
//}
//int main() {
//	int a;
//	int b;
//	cout << "Enter the two values" << endl;
//	cin >> a >> b;
//
//	int &a1 = a;
//	int &b1 = b;
//	
//	cout << "Original value of a is:" << a << endl << "Original value of b is:" << b << endl;
//	check(a, b);
//	cout << "New value of a is :" << a << endl << "New value of b is:" << b << endl;
//	return 0;
//
//}





















//		11)
//		class kmtr
//		{
//			int unit;
//			void disp()
//			{
//				cout << unit
//			}
//};
//
//class Mtr
// 
//{
//	int unit;
//	void disp()
//	{
//		cout << unit
//	}
//};
//
//inside main
//Kmtr first(20);
//Mtr second(40000);
//first.disp();  // 20
//second.disp(); // 40000
//first = second;  // conversion
//first.disp();  // 40
//

//#include <iostream>
//using namespace std;
//class Mtr;
//class kmtr
//		{
//			int unit;
//		public:
//			kmtr(int val) {
//				unit = val;
//			}
//			int getnum() {
//				return unit;
//			}
//			void disp()
//			{ 
//				cout << unit<<endl;
//			}
//
//			void operator=(Mtr& ref);
//
//};
//
//class Mtr
//{
//	int unit;
//public:
//	Mtr(int val) {
//		unit = val;
//	}
//	int getnum() {
//		return unit;
//	}
//	void disp()
//	{
//		cout << unit << endl;
//	}
//};
//
//
//
//void kmtr:: operator=(Mtr& ref) {
//	unit = ref.getnum() / 1000;
//}
//
//int main() {
//  
//	kmtr first(20);
//    Mtr second(40000);
//    first.disp();  // 20
//    second.disp(); // 40000
//    first = second;  // conversion  first.operator(second);
//    first.disp();
//	return  0;
//}

//20
//40000
//40























//12)
//
//class A
//{
//	int num1;
//   };
//   class B
//   {
//	   int num2;
//   };
//   write a friend function with the name "check", which will check whether
//	   num1 > num2 - returns 1
//	   num1 < num2 - returns - 1
//	   num1 == num2 - returns 0
//
//	   in the main function achieve the following tasks :
//
//   int data1, data2;
//   cout << "enter two numbers" << endl;
//   cin >> data1 >> data2;
//   A one(data1);
//   B two(data2);
//   cout << check(one, two); // output should be either 1 or -1 or 0



//Sol:-


//#include <iostream>
//using namespace std;
//class B;
//class A
//{
//	int num1;
//public:
//    A(int a) {
//        num1 = a;
//    }
//
//    friend int check(A&, B&);
//};
//class B
//{
//	   int num2;
//
//public:
//    B(int b) {
//        num2 = b;
//    }
//    friend int check(A&, B&);
//
//};
//
//int check(A& ref1, B& ref2) {
//    if (ref1.num1 > ref2.num2) {
//        return 1;
//    }
//    else if (ref1.num1 < ref2.num2) {
//        return -1;
//    }
//    else {
//        return 0;
//    }
//
//
//}
//
//
//
//
//int main() {
//	 int data1, data2;
//     cout << "enter two numbers" << endl;
//     cin >> data1 >> data2;
//     A one(data1);
//     B two(data2);
//     cout << check(one, two);
//     return 0;
//
//}
//
//enter two numbers
//50
//60
//- 1