public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("This program gives quick tips on how to take better pictures and the amount of words");

        // This wordlist will randomize the tips, there's no steps
        String [] wordlist = {"The more a scene is changing, the more pictures you should take", "If a football player is moving " +
                ", hold down the shutter until he reaches touchdown", "Learn your camera, turn the flash on and off, select continuous shooting " +
                "select the camera's time, select aperture priority, and shutter priority, View the historgram. "};
        String [] cameraterms ={"Shutter", "Iso", "Aperture"};

        String link = "<a href=\"https://www.behance.net/johnbel4585e51\" target=\"_blank\">http://abcd.efg.com</a>";
        String link2 = "<a href=\"https://www.behance.net/johnbel4585e51\" target=\"_blank\">http://abcd.efg.com</a>";
        String link3 = "<a href=\"https://www.exposureguide.com/top-10-digital-photography-tips/\" target=\"_blank\">http://abcd.efg.com</a>";

        String [] arraylink={link, link2, link3};

        //finding out how many words
        int oneLenght = wordlist.length;
        int twolenght= cameraterms.length;
        int threelenght= arraylink.length;


        //generate random numbees
        int rand1 =(int)(Math.random() * oneLenght);
        int rand2= (int)(Math.random()*twolenght);
        int rand3=(int)(Math.random() * threelenght);


        String phrase= wordlist[rand1] + "  " + cameraterms[rand2] + "  " + arraylink[rand3];
        System.out.println("Tips for photography:" +" " + phrase);


    }
}
