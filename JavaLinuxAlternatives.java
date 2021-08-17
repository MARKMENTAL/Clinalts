import java.util.Scanner;

public class JavaLinuxAlternatives{

    static void intro(){
        System.out.println("Welcome to Java Linux Alternatives, type a program name to find a Linux alternative");
        System.out.println("Examples: 'photoshop', 'office', 'illustrator', 'notepad', 'winrar'");
    }

    static void printphotoshop(){
        System.out.println("A great alternative to Adobe Photoshop is the GNU Image Manipulation Program");
        System.out.println("Fedora DNF Install Command: 'dnf install gimp'");
        System.out.println("Debian APT Install Command: 'apt-get install gimp'");
    }

    static void printoffice(){
        System.out.println("A great alternative to Microsoft Office is the free office suite LibreOffice");
        System.out.println("Fedora DNF Install Command: 'dnf install libreoffice'");
        System.out.println("Debian APT Install Command: 'apt-get install libreoffice'");
    }

    static void printillustrator(){
        System.out.println("A great alternative to Adobe Illustrator is the vector imaging program Inkscape");
        System.out.println("Fedora DNF Install Command: 'dnf install inkscape'");
        System.out.println("Debian APT Install Command: 'apt-get install inkscape'");
    }

    static void printpremiere(){
        System.out.println("A great alternative to Adobe Premiere is the video editing program Flowblade");
        System.out.println("Fedora DNF Install Command: 'dnf install flowblade'");
        System.out.println("Debian APT Install Command: 'apt-get install flowblade'");
    }

    static void printnotepad(){
        System.out.println("A great alternative to Microsoft Notepad is the text editor Leafpad");
        System.out.println("Fedora DNF Install Command: 'dnf install leafpad'");
        System.out.println("Debian APT Install Command: 'apt-get install leafpad'");
    }

    static void printsublime(){
        System.out.println("A great alternative to Sublime Text is the KDE text/code editor Kate");
        System.out.println("Fedora DNF Install Command: 'dnf install kate'");
        System.out.println("Debian APT Install Command: 'apt-get install kate'");
    }

    static void printfls(){
        System.out.println("A great alternative to FL Studio is the music DAW LMMS");
        System.out.println("Fedora DNF Install Command: 'dnf install lmms'");
        System.out.println("Debian APT Install Command: 'apt-get install lmms'");
    }

    static void printwinrar(){
        System.out.println("A great alternative to WinRAR is the Linux command line tool UnRar");
        System.out.println("Fedora DNF Install Command: 'dnf install unrar'");
        System.out.println("Debian APT Install Command: 'apt-get install unrar'");
        System.out.println("Example of using UnRar to extract a .rar file: 'unrar e yourfilehere.rar'");
    }

    static void printsolitaire(){
        System.out.println("A great alternative to Windows solitaire is the Aisleriot solitaire game");
        System.out.println("Fedora DNF Install Command: 'dnf install aisleriot'");
        System.out.println("Debian APT Install Command: 'apt-get install aisleriot'");
    }

    static void printdoom(){
        System.out.println("A great alternative to the classic FPS game DOOM is FreeDOOM");
        System.out.println("Fedora DNF Install Command: 'dnf install freedoom'");
        System.out.println("Debian APT Install Command: 'apt-get install freedoom'");
    }

    static void printexplorer(){
        System.out.println("A great alternative to the Windows Explorer file manager is KDE's Dolphin file manager");
        System.out.println("Fedora DNF Install Command: 'dnf install dolphin'");
        System.out.println("Debian APT Install Command: 'apt-get install dolphin'");
    }

    static void printvs(){
        System.out.println("A great alternative to using the Microsoft Visual Studio IDE for GUI applications is QtCreator");
        System.out.println("Fedora DNF Install Command: 'dnf install qtcreator'");
        System.out.println("Debian APT Install Command: 'apt-get install qtcreator'");
        System.out.println("Note: It is recommended by the Qt Company to install Qt/QtCreator from their website, access it with the link below");
        System.out.println("https://www.qt.io/download-thank-you?hsLang=en");
    }

    static void find(String program){
        System.out.println("User Entered: " + program);
        switch(program.toLowerCase()){
            case "photoshop":
                printphotoshop();
                break;
            case "office":
                printoffice();
                break;
            case "illustrator":
                printillustrator();
                break;
            case "premiere":
                printpremiere();
                break;
            case "notepad":
                printnotepad();
                break;
            case "sublime":
                printsublime();
                break;
            case "fl studio":
                printfls();
                break;
            case "winrar":
                printwinrar();
                break;
            case "solitaire":
                printsolitaire();
                break;
            case "doom":
                printdoom();
                break;
            case "explorer":
                printexplorer();
                break;
            case "visual studio":
                printvs();
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
