import 'package:flutter/material.dart'; //imports do material e da tela home
import 'pages/home.dart';

class MyApp extends StatelessWidget { //stateless widget simples que puxa a tela inicial (Home)
const MyApp({super.key});

    @override
    Widget build(BuildContext context){ //a build que só retorna um aplicativo de material e usa a Home
        return const MaterialApp(
            home: Home(),
        );
    }
}