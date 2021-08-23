/*{{ CLinalts }}
Copyright (C) {{ 2021 }}  {{ markmental }}

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*

This version of Clinalts is optimized for running on windows*/

#include <stdio.h>
#include <string.h>

void printphotoshop(){
    printf("GNU Image Manipulation Program\nFedora DNF Install Command: 'dnf install gimp'\nDebian APT Install Command: 'apt-get install gimp'\n");
}

void printoffice(){
    printf("Libreoffice\nFedora DNF Install Command: 'dnf install libreoffice'\nDebian APT Install Command: 'apt-get install libreoffice'\n");
}

void printillustrator(){
    printf("Inkscape\nFedora DNF Install Command: 'dnf install inkscape'\nDebian APT Install Command: 'apt-get install inkscape'\n");
}

void printnotepad(){
    printf("Leafpad\nFedora DNF Install Command: 'dnf install leafpad'\nDebian APT Install command: 'apt-get install leafpad'\n");
}

void printwinrar(){
    printf("UnRar\nFedora DNF Install Command: 'dnf install unrar'\nDebian APT Install Command: 'apt-get install unrar'\nExample of using UnRar to extract a .rar file: 'unrar e yourfilehere.rar'\n");
}

void printsolitaire(){
    printf("Aisleriot\nFedora DNF Install Command: 'dnf install aisleriot'\nDebian APT Install Command: 'apt-get install aisleriot'\n");
}

void printdoom(){
    printf("FreeDOOM\nFedora DNF Install Command: 'dnf install freedoom'\nDebian APT Install Command: 'apt-get install freedoom'\n");
}

void helpmenu(){
    const char *programarray[7] = {"photoshop", "office", "illustrator", "notepad", "winrar", "solitaire", "doom"};
    printf("List of alternatives:\n");
    
    for (int i = 0; i < 7; i+=1){
        printf("%s\n",programarray[i]);
    }
}

void mainmenu(){
    char programname[25];
    //setting intresult to 1 when a result is found, 2 when not. Kind of like a boolean
    //This is so the default 0 value for ints doesn't trigger anything in the program, it can be problematic with 0 and 1
    int foundresult = 2;
    printf("Welcome to Clinalts, a program for finding free/open-source alternatives to proprietary programs, type a program name to find a Linux alternative\n");
    printf("Help: '-h'\n");
    //writes user input to the 'programname' buffer
    scanf("%s", &programname);
    int stringcheck = strncmp(programname, "-h", 2);
        
    if (stringcheck == 0){
        helpmenu();
        scanf("%s", &programname);
    }
        
    stringcheck = strncmp(programname, "photoshop", 9);
    if (stringcheck == 0){
        printf("A good alternative to photoshop is:\n");
        printphotoshop();
        foundresult = 1;
    }
            
    stringcheck = strncmp(programname, "office", 6);
    if (stringcheck == 0){
        printf("A good alternative to office is:\n");
        printoffice();
        foundresult = 1;
    }
        
    stringcheck = strncmp(programname, "illustrator", 11);
    if (stringcheck == 0){
        printf("A good alternative to illustrator is:\n");
        printillustrator();
        foundresult = 1;
    }
        
    stringcheck = strncmp(programname, "notepad", 7);
    if (stringcheck == 0){
        printf("A good alternative to notepad is:\n");
        printnotepad();
        foundresult = 1;
    }
    
    stringcheck = strncmp(programname, "winrar", 6);
    if (stringcheck == 0){
        printf("A good alternative to winrar is:\n");
        printwinrar();
        foundresult = 1;
    }
    
    stringcheck = strncmp(programname, "solitaire", 9);
    if (stringcheck == 0){
        printf("A good alternative to solitaire is:\n");
        printsolitaire();
        foundresult = 1;
    }
    
    stringcheck = strncmp(programname, "doom", 4);
    if (stringcheck == 0){
        printf("A good alternative to doom is:\n");
        printdoom();
        foundresult = 1;
    }
        
    if (foundresult == 2) {printf("Program was not found...\n");}
}

int main(){
    mainmenu();
    return 0;
}
