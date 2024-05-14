import 'package:flutter/material.dart';

void main() {
    runApp(const MyApp());
}

class MyApp extends StatelessWidget {
    const MyApp({super.key});

    @override
    Widget build(BuildContext context) {
        return MaterialApp(
            home: Scaffold(
                appBar: AppBar(),
                drawer: Drawer(
                    child: ListView(
                        padding: EdgeInsets.zero,
                        children: <Widget>[
                            const DrawerHeader(
                                decoration: BoxDecoration(
                                    color: Colors.amber
                                ),
                                child: Text("bolas", style: TextStyle(fontSize: 80),),
                            ),
                            ListTile(
                                leading: const Icon(Icons.home),
                                title: const Text("Olha aqui o texto que chocante"),
                                onTap: () {},
                            ),
                            ListTile(
                                leading: const Icon(Icons.home),
                                title: const Text("uau texto 2"),
                                onTap: () {},
                            ),
                            ListTile(
                                leading: const Icon(Icons.wallet_giftcard),
                                title: const Text("entendi drawer"),
                                onTap: () {},
                            ),
                        ],
                    ),
                ),
                body: const Center(
                    child: Text("yeyeyaeaeae", style: TextStyle(fontSize: 200),),
                ),
            ),
        );
    }
}