def readln=javax.swing.JOptionPane.&showInputDialog
Double precio,IVA,Total
precio=Double.parseDouble(readln('El precio sin IVA es'))
IVA=Double.parseDouble(readln('16% IVA del precio'))
Total=precio*16/100+precio
println 'El total del precio con IVA es'
println Total
