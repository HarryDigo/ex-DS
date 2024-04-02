import 'package:flutter/material.dart';

void main() {
    runApp(MyApp());
}

class MyApp extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
        return MaterialApp(
            home: Scaffold(
                appBar: AppBar(
                    title: const Text('bolas'),
                    backgroundColor: const Color(0x4400ff00),
                ),
                body: Row(
                    children: [
                        const Column(
                            children: [
                                Text('bolas 1'),
                                Text('bolas 2'),
                                Icon(Icons.flutter_dash_sharp)],
                        ),
                        Column(
                            children: [
                                const Text('bolas 27'),
                                const Text('bolas 72'),
                        OutlinedButton(
                            onPressed: () {
                                print('bolas');
                            }, 
                            child: const Text('calcular bolas'))],
                        ),
                    ]),
            ),
        );
    }       
}