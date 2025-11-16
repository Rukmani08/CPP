//#include<iostream>
//using namespace std;
//int main() {
//	int n = 420;
//	cout << n << endl;
//	char* r = new char[10];
//	for (int i = 0;i < 9;i++) {
//		r[i]= 'a' + i;
//
//	}
//	r[9] = '\0';
//	/*cout << r << "\n";*/
//	for (int i = 0;i <= 9;i++) {
//		cout << r[i] << "\t";
//	}
//	delete[] r;
//	r = nullptr;
//	return 0;
//
//}


//2)

//#include<iostream>
//#include<cstring>
//using namespace std;
//class First{
//	char* s=nullptr;
//	char* t=nullptr;
//public:
//	First() {
//		cout << "Defalt" << endl;
//	}
//	First(const char* s, const char* t) {
//		cout << "parametrized" << endl;
//		this->s = new char[strlen(s) + 1];
//		strcpy_s(this->s, strlen(s) + 1, s);
//		this->t = new char[strlen(t) + 1];
//		strcpy_s(this->t, strlen(t) + 1, t);
//
//	}
//	First(First& ref) {
//		cout << "Copy Constructor" << endl;
//		s = new char[strlen(ref.s) + 1];
//		strcpy_s(s, strlen(ref.s)+1, ref.s);
//		t = new char[strlen(ref.t) + 1];
//		strcpy_s(t, strlen(ref.t)+1, ref.t);
//
//	}
//	First& operator=(First& ref) {
//		cout << "= operator" << endl;
//		s = new char[strlen(ref.s) + 1];
//				strcpy_s(s,strlen(ref.s)+1,ref.s);
//				t = new char[strlen(ref.t)+1];
//				strcpy_s(t, strlen(ref.t) + 1, ref.t);
//				return *this;
//	}
//	~First() {
//		cout << "Destructor" << endl;
//		delete[] s;
//		s = nullptr;
//		delete[] t;
//		t = nullptr;
//
//	}
//	void disp() {
//		cout << s << "\n" << t;
//	}
//
//
//
//};
//
//
//int main() {
//		First f1("hello", "welcome");
//		f1.disp();
//		First f2 = f1;		// This calls the copy constructor Because f2 is being created and initialized with another object.
//		f2.disp();
//		First f3;
//		f3 = f1; //f3.operator=(f1) /* This does NOT call copy constructor .It calls copy assignment operator (operator=).Because object f3 already exists, and now it's being assigned.*/
//		f3.disp();
//	
//		return 0;
//	}

//#include <iostream>
//using namespace std;
//
//class Voter {
//	int id;
//	char* name;
//	char* address;
//public:
//	void input() {
//      
//		cin >> id;
//		cin.ignore();
//		cin.getline(name,100);
//		cin.getline(address,100);
//
//	
//	}
//	void  show() {
//		cout << id << "\t" << name << "\t" << address << endl;
//	   
//	}
//
//	Voter(){
//		cout << "Default" << endl;
//		id = 0;
//	
//		name = new char[100];
//		address = new char[100];
//	}
//	~Voter() {
//		delete[] name;
//		delete[] address;
//		
//	}
//
//
//};
//int main() {
//	int size;
//	cin >> size;
//	Voter* v = new Voter[size];
//	for (int i = 0;i < size;i++) {
//		v[i].input();
//	}
//	for (int i = 0;i < size;i++) {
//		v[i].show();
//	}
//	delete[] v;
//	return 0;
//}


//4>



#include <iostream>
using namespace std;


class Sample {
	int num;
public:
	Sample():num(0) {
		cout << "Default" << endl;
	}

	Sample(int val) {
		num = val;
	}
	void display() {
		cout << num << endl;

	}
	Sample operator-(int k) {
		return Sample(num - k);
	}
	Sample operator=(int k){
		return Sample(num = k);
	}
	operator int() {
		return num;
	}
	Sample operator+( Sample& ref1) {
		return Sample(num+ref1.num);
	}

	Sample& operator++() {
		num++;
		return *this;
	}
	Sample operator++(int) {
		return Sample(num++);
	}
	Sample& operator +=(int m) {
		num += m;
		return *this;
	
	}
	friend Sample operator+(int k, Sample& ref);
	friend istream& operator>>(istream& ref2, Sample& ref3);
	 friend ostream& operator<<(ostream& ref4, Sample& ref5);
};
Sample operator+(int k, Sample& ref) {
	return Sample(k + ref.num);
}
istream& operator>>(istream& ref2, Sample& ref3) {
	ref2 >> ref3 ;
	return ref2;
}

ostream& operator<<(ostream& ref4, Sample& ref5) {
	ref4 << ref5;
	return ref4;
}



 
int main() {
	Sample s1(300),s2(100),s4;

		s1=s1 - 30;//s1.operator-(300);
		s1.display();
		
	    s1 = 600; //s1.operator=(600);
		s1.display();
		
		int data = s1; //operator int (){return num;}
		cout << data << endl;
		Sample s3= s1 + s2;
		 s3.display();
		++s1;  //s1.operator();
		s1.display();
		s1++;
		s1.display();
		s1 += 20; //
		s1.display();
	    s4= 100 + s1; //operator+(int k,Sample&m1);
		s4.display();
		cin >> s1;//operator

		cout << s1;

}










































