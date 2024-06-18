import 'package:flutter/material.dart';
import 'package:gooday/page1.dart';

class SplashScreen extends StatefulWidget {
    const SplashScreen({super.key});

    @override
    State<SplashScreen> createState() => _ScreenState();
}

class _ScreenState extends State<SplashScreen> {

    @override
    void initState() {
        super.initState();
        Future.delayed(const Duration(milliseconds: 500))
            .then((_) => {
                Navigator.push(context, MaterialPageRoute(builder: (context) => const Page1()))
            });
    }
    @override 
    Widget build(BuildContext context) {
        return Scaffold(
            backgroundColor: const Color(0xff14c871),
            body: Center(
                child: Image.asset("images/Logotipo.png"),
            ),
        );
    }
}