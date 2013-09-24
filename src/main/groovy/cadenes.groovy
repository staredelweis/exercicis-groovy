//escriure alguna cosa
    println "hola"
// inicialitzem variables
    a= 'hola'
    b='ester'
    println "b es:"+b
//amb cometa doble el que hi hagi entre $ {} es substitueix pel resultat de l'expressió
    c="${a} ${b}"
    println "c es:"+c
// amb tres cometes dobles cadenes multilinea també aplica la substitució de variables
    d="""
    que
    passa
    ${b.capitalize()}
    """
    println "d es:"+d
//longitud d'una cadena
    e=d.size()
    println "e es:"+e
    f=d.length()
    println "f es:"+f
//obtenir el primer caràcter
    g=a[0]
    println "g es:"+g
// obtenir el segon caràcter
    h=a[1]
    println "h es:"+h
//obtenir últim caràcter. S'utilitzen negatius per començar a contar desde el final
    i=a[-1]
    println "i es:"+i
    