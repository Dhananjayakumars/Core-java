package com.xworkz.threadConcept;

public class Numbers {

	public static void main(String[] args) {
		
		Thread1To50 thread1To50=new Thread1To50();
		thread1To50.start();
		Thread51to100 thread51to100= new Thread51to100();
		thread51to100.start();
		

	}

}

//output
//Thread details are Thread-0and10
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12
//13
//Thread details are Thread-1and11
//14
//15
//16
//17
//18
//19
//20
//21
//22
//23
//24
//25
//26
//27
//28
//29
//30
//31
//32
//33
//34
//35
//36
//37
//38
//39
//40
//41
//42
//43
//44
//45
//46
//47
//48
//49
//50
// End of Thread Thread-0and10
//51
//52
//53
//54
//55
//56
//57
//58
//59
//60
//61
//62
//63
//64
//65
//66
//67
//68
//69
//70
//71
//72
//73
//74
//75
//76
//77
//78
//79
//80
//81
//82
//83
//84
//85
//86
//87
//88
//89
//90
//91
//92
//93
//94
//95
//96
//97
//98
//99
//100
// End of Thread Thread-1and11

