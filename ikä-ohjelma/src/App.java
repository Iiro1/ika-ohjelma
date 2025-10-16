public class App {
    public static void main(String[] args) throws Exception {

int ika = 45;

// Tulostusehdot

if (ika >= 0 && ika < 20)

{

System.out.println("Olet alaikäinen");

}

else

{

System.out.println("Olet aikuinen");

}

if (ika > 0 && ika < 18) { System.out.println("Olet alaikäinen"); } else if (ika >= 65) { System.out.println("Olet eläkeläinen"); } else { System.out.println("Olet aikuinen"); }


if (ika > 0 && ika < 18) {

System.out.println("Olet alaikäinen");

if (ika >= 15) {

System.out.println("Saat ajaa mopoa"); }

} else if (ika >= 65) {

System.out.println("Olet eläkeläinen");

} else {

System.out.println("Olet aikuinen");

} 


if (ika > 0 && ika < 18) {

System.out.println("Olet alaikäinen");

if (ika >= 16) {

System.out.println("Saat ajaa kevaria"); }

} else if (ika >= 65) {

System.out.println("Olet eläkeläinen");

} else {

System.out.println("Olet aikuinen");

} 


if (ika >= 18)
{
    System.out.println("olet täysi-ikäinen ja saat ajaa autoa");

}

int [] iat = {20, 25, 30, 40, 55, 60};


//tarkistetaan tasavuosikymmen ja aikuisuus
   
if (ika >= 18 && ika % 10 == 0) {
        System.out.println("Onnittelut  " + ika + " vuoden merkkipaalusta!");
    }

if (ika >= 100){
    System.out.println("++++++++++++++++++++++++++++++++++++++! ");
    System.out.println("Onnittelut sadan vuoden kypsästä iästä! ");
}   System.out.println("++++++++++++++++++++++++++++++++++++++! ");


if (ika >= 58) {
    System.out.println("pääset muuten eläkkeelle");

}

if (ika == 65) {
System.out.println("hyviä eläkepäiviä!");

}

if (ika > 40 && ika < 50) {
    System.out.println("parasta keski-ikää!");
}









}

 } 

