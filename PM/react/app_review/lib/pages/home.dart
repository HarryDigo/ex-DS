import 'package:flutter/material.dart';

class Home extends StatefulWidget {
    const Home({super.key});

    @override
    _HomeState createState() => _HomeState();
}

class _HomeState extends State<Home> {
    @override
    Widget build(BuildContext context) {
        return Scaffold(
            body: Container(

            ),
            appBar: AppBar(

            ),
            drawer: const Drawer(
                
            ),
            bottomNavigationBar: BottomNavigationBar(
                items: const [
                    
                ],
            ),
            floatingActionButton: FloatingActionButton(
                onPressed: () {print("gala sólida");},
            ),
        );
    }
}