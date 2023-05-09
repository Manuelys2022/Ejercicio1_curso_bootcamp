public class EstructurasDeControl {   public static void main(String[] args) {
    // Usando un if para comparar el valor de numeroIf
    int numeroIf = -5;
    if (numeroIf < 0) {
        System.out.println("El número es negativo.");
    } else if (numeroIf > 0) {
        System.out.println("El número es positivo.");
    } else {
        System.out.println("El número es igual a 0.");
    }
    // Bucle while para incrementar y mostrar el valor de numeroWhile
    int numeroWhile = 0;
    while (numeroWhile < 3) {
        numeroWhile++;
        System.out.println("Valor del número en el bucle While: " + numeroWhile);
    }
    // Bucle do-while que se ejecuta al menos una vez
    int numeroDoWhile = 0;
    do {
        numeroDoWhile++;
        System.out.println("Valor del número en el bucle Do-While: " + numeroDoWhile);
    } while (numeroDoWhile < 3);
    // Bucle for para mostrar valores del 0 al 3
    for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
        System.out.println("Valor del número en el bucle For: " + numeroFor);
    }
    // Switch para determinar la estación del año
    String estacion = "primavera";
    switch (estacion) {
        case "primavera":
            System.out.println("Estamos en primavera.");
            break;
        case "verano":
            System.out.println("Estamos en verano.");
            break;
        case "otoño":
            System.out.println("Estamos en otoño.");
            break;
        case "invierno":
            System.out.println("Estamos en invierno.");
            break;
        default:
            System.out.println("El valor de la variable no corresponde a una estación.");
            break;
    }
}
}







