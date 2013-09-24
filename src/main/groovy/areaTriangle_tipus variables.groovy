//aquesta linea es per poder llegir l'entrada de les dades de l'usuari
def readln=javax.swing.JOptionPane.&showInputDialog
// declaracion de variables. 
//las variables REAL en groovy se llaman Double
//entero= Integer
//un caracter= Char
//una cadena=String

    Double b,a,A
//inici 
//println=mostrar
//readln=leer del usuario
            //println 'base del triangulo'
    b=Double.parseDouble(readln ('base del triangulo'))
            //println 'altura del triangulo'
    a=Double.parseDouble(readln ('altura del triangulo'))
    A=b*a/2
    println 'El area del triangulo es'
    println A
   