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
                body: Center(
                  child: Container(
                      width: 300,
                      height: 150,
                      decoration: BoxDecoration(
                          border: Border.all(color: Colors.black),
                          
                      ),
                      child: const Column(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                              Row(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: [
                                      SizedBox(
                                          width: 80,
                                          child: Icon(
                                              Icons.account_circle,
                                              size: 60,
                                          ),
                                      ),
                                      Column(
                                          crossAxisAlignment: CrossAxisAlignment.start,
                                          children: [
                                              Text(
                                                  "Flutter McFlutter",
                                                  style: TextStyle(fontSize: 22),
                                              ),
                                              Text("Experienced App Developer")
                                          ],
                                      )
                                  ],
                              ),
                              SizedBox(
                                  height:40,
                                  child: Row(
                                      mainAxisAlignment: MainAxisAlignment.center,
                                      children: [
                                          SizedBox(
                                              width:160,
                                              child: Text("123 Main Street"),
                                          ),
                                          Text("(415) 555-0198"),
                                      ],
                                  ),
                              ),
                              Row(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: [
                                      SizedBox(
                                          width: 60,
                                          child: Icon(Icons.accessibility_new),
                                      ),
                                      SizedBox(
                                          width: 60,
                                          child: Icon(Icons.timer),
                                      ),
                                      SizedBox(
                                          width: 60,
                                          child: Icon(Icons.phone_android),
                                      ),
                                      SizedBox(
                                          width: 60,
                                          child: Icon(Icons.phone_iphone),
                                      ),
                                  ]
                              )
                          ],
                      ),
                  ),
                )
            ),
        );
    }       
}