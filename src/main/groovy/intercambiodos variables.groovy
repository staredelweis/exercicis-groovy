//
    def readln=javax.swing.JOptionPane.&showInputDialog
//Declaración de variables, debemos declarar 3 variables a y b para intercanviar 
//y c  para guardar el valor de la variable a intercanviar  
    Double a,b,c
//
    a=Double.parseDouble(readln('Contenido variable a'))
    b=Double.parseDouble(readln('Contenido variable b'))
//asignamos el valor de "a" a la variable c para realizar el intercambio entre a y b
    c=a
//intercambiamos el valor de a por el valor de b
    a=b
//introducimos que valor tiene la variable a   
    println 'Contenido variable a es'
//mostramos por pantalla el valor de la variable a   
    println  a
//intercambiamos el valor de la variable b     
    b=c
//introducimos que valor tiene la variable b    
    println'Contenido variable b es'
//mostramos por pantalla el valor de la variable b    
    println b
