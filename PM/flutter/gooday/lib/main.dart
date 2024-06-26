import 'package:flutter/material.dart';
import 'package:gooday/splashscreen.dart';

//AVISO PARA O RAFAEL OU LUIS EDUARDO:
//
//Vou deixar sem comentário, mas confia, fui eu que fiz tudo (da para ver pela gambiarra) e consigo explicar tudo (menos aqueles expanded da row la embaixo na pagina 2 que eu realmente peguei da internet (divisória fofa))
//
//Trabalhodo rodrigo scatolin flora do rio do 2° DS
//
//Mais uma coisa, o trabalho inteiro foi feito para EXATAMENTE a configuração do samsung galaxy s8+ na exibição mobile do inspecionar do google, se estiver errado fora disso não é culpa minha (é sim)

void main() {
    runApp(const MyApp());
}

class MyApp extends StatelessWidget {
    const MyApp({super.key});

    @override
    Widget build(BuildContext context) {
        return const MaterialApp(
            debugShowCheckedModeBanner: false,
            home: SplashScreen(),
        );
    }
}