import 'package:flutter/material.dart';

void main() {
    runApp(MyApp());
}

class MyApp extends StatelessWidget {
    MyApp({super.key});
    final PageController _pageController = PageController(initialPage: 0);

    @override
    Widget build(BuildContext context) {
        return MaterialApp(
            home: Scaffold(
                appBar: AppBar(title: const Text(("pogview poger"))),
                body: PageView(
                    controller: _pageController,
                    children: [
                        Container(
                            color: Colors.amber,
                            child: const Center(
                                child: Text(
                                    "amogus gaming",
                                    style: TextStyle(color: Colors.blue, fontSize: 36),
                                ),
                            ),
                        ),
                        Container(
                            color: Colors.purple,
                            child: const Center(
                                child: Text(
                                    "amogus gaming",
                                    style: TextStyle(color: Colors.yellow, fontSize: 36),
                                ),
                            ),
                        ),
                    ],
                ),
                floatingActionButton: FloatingActionButton(
                    onPressed: () {
                        if (_pageController.page! < 1) {
                            _pageController.nextPage(duration: const Duration(seconds: 4), curve: Curves.bounceInOut);
                        }
                    },
                    child: const Icon(Icons.adb),
                ),
            ),
        );
    }
}