package com.midgarb.day4.f15;

public class Dinamiki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
static int Size(){
	int height = 25;
	int weight = 15;
	int tolshina = 15;
	int size = 500;
	int soundVoice = 60;
	
	return height*weight*tolshina*(size-soundVoice);
}
static long Voice(){
	long dlinaVolniKoli = 25000000;
	long minVoice = 15454554;
	long maxVoice = 1557687;
	long tolshina = 5085570;
	long rasstoianie = 454576454;
	
	return dlinaVolniKoli*minVoice*maxVoice*(tolshina-rasstoianie);
}
static boolean Sostoianie(){
	boolean active1 = false;
	boolean active2 = false;
	boolean active3 = false;
	boolean active4 = false;
	boolean active5 = false;
	return (active1 && active2);
}
static String Material(){
String kabeli = "Odnojilniii";
String korpus = "derevo";
String sxemi = "plastic";
String dinamik = "aliuminii";
String knopki = "plastic";
	
	String str = (kabeli + " "+ korpus + " "+ sxemi + " "+ " "+ dinamik + " "+ knopki);
	return str;
}

}
