
public class areEquallyStrong {
	/*
	 * Call two arms equally strong if the heaviest weights they each are able to lift are equal.

Call two people equally strong if their strongest arms are equally strong (the strongest arm can be both the right and the left), and so are their weakest arms.

Given your and your friend's arms' lifting capabilities find out if you two are equally strong.

Example

For yourLeft = 10, yourRight = 15, friendsLeft = 15, and friendsRight = 10, the output should be
solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;
For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 10, the output should be
solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;
For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 9, the output should be
solution(yourLeft, yourRight, friendsLeft, friendsRight) = false.
	 */

	public static void main(String[] args) {

		System.out.println(areEqStrong(10, 15, 15, 10));
	}
	
	public static boolean areEqStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight)
	{
		int strongu = (yourLeft>yourRight) ? yourLeft : yourRight;
	    int weaku = (yourLeft>yourRight) ? yourRight : yourLeft;
	    
	    int  strongfriend = (friendsLeft>friendsRight) ? friendsLeft : friendsRight;
	    int weakfriend = (friendsLeft>friendsRight) ? friendsRight : friendsLeft;
	    return (strongu == strongfriend && weaku == weakfriend) ? true: false;
	    
	}

}
