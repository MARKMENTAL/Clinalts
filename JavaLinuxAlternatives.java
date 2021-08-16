import java.util.Scanner;

public class JavaLinuxAlternatives{

    static void intro(){
        System.out.println("Welcome to Java Linux Alternatives, type a program name to find a Linux alternative");
        System.out.println("Examples: 'photoshop', 'office', 'illustrator', 'notepad', 'winrar'");
    }

    static void find(String program){
        System.out.println("User Entered: " + program);
        switch(program.toLowerCase()){
            case "photoshop":
                System.out.println("A great alternative to Adobe Photoshop is the GNU Image Manipulation Program");
                System.out.println("Fedora DNF Install Command: 'dnf install gimp'");
                System.out.println("Debian APT Install Command: 'apt-get install gimp'");
                break;
            case "office":
                System.out.println("A great alternative to Microsoft Office is the free office suite LibreOffice");
                System.out.println("Fedora DNF Install Command: 'dnf install libreoffice'");
                System.out.println("Debian APT Install Command: 'apt-get install libreoffice'");
                break;
            case "illustrator":
                System.out.println("A great alternative to Adobe Illustrator is the vector imaging program Inkscape");
                System.out.println("Fedora DNF Install Command: 'dnf install inkscape'");
                System.out.println("Debian APT Install Command: 'apt-get install inkscape'");
                break;
            case "premiere":
                System.out.println("A great alternative to Adobe Premiere is the video editing program Flowblade");
                System.out.println("Fedora DNF Install Command: 'dnf install flowblade'");
                System.out.println("Debian APT Install Command: 'apt-get install flowblade'");
                break;
            case "notepad":
                System.out.println("A great alternative to Microsoft Notepad is the text editor Leafpad");
                System.out.println("Fedora DNF Install Command: 'dnf install leafpad'");
                System.out.println("Debian APT Install Command: 'apt-get install leafpad'");
                break;
            case "sublime":
                System.out.println("A great alternative to Sublime Text is the KDE text/code editor Kate");
                System.out.println("Fedora DNF Install Command: 'dnf install kate'");
                System.out.println("Debian APT Install Command: 'apt-get install kate'");
                break;
            case "fl studio":
                System.out.println("A great alternative to FL Studio is the music DAW LMMS");
                System.out.println("Fedora DNF Install Command: 'dnf install lmms'");
                System.out.println("Debian APT Install Command: 'apt-get install lmms'");
                break;
            case "winrar":
                System.out.println("A great alternative to WinRAR is the Linux command line tool UnRar");
                System.out.println("Fedora DNF Install Command: 'dnf install unrar'");
                System.out.println("Debian APT Install Command: 'apt-get install unrar'");
                System.out.println("Example of using UnRar to extract a .rar file: 'unrar e yourfilehere.rar'");
                break;
            case "solitaire":
                System.out.println("A great alternative to Windows solitaire is the Aisleriot solitaire game");
                System.out.println("Fedora DNF Install Command: 'dnf install aisleriot'");
                System.out.println("Debian APT Install Command: 'apt-get install aisleriot'");
                break;
            case "doom":
                System.out.println("A great alternative to the classic FPS game DOOM is FreeDOOM");
                System.out.println("Fedora DNF Install Command: 'dnf install freedoom'");
                System.out.println("Debian APT Install Command: 'apt-get install freedoom'");
                break;
            default:
                System.out.println(program + " was not found");
                break;
        }
    }

    public static void main(String[] args){
        int running = 0;
        while (running == 0){
            intro();
            Scanner scan = new Scanner(System.in);
            String program = scan.nextLine();
            find(program);
            System.out.println("Run again?(y/n)");
            program = scan.nextLine();
            if (program.toLowerCase().equals("n")){running = 1;}
        }
    }

}
