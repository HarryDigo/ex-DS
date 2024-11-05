import 'package:flutter/material.dart';
import '../utils/shared.dart';
import 'login.dart';
import 'home.dart';

class SplashScreen extends StatefulWidget {
    const SplashScreen({super.key});

    @override
    State<SplashScreen> createState() => _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> {
    @override
    void initState() {
        super.initState();
        _checkLoginStatus();
    }

    Future<void> _checkLoginStatus() async {
        bool isLoggedIn = await SharedPrefs.getLoginStatus();
        if (isLoggedIn) {
            Navigator.pushReplacement(
                context,
                MaterialPageRoute(builder: (context) => const HomePage()),
            );
        } else {
            Navigator.pushReplacement(
                context,
                MaterialPageRoute(builder: (context) => const LoginPage()),
            );
        }
    }


    @override
    Widget build(BuildContext context) {
        return const Scaffold(
            body: Center(
                child: CircularProgressIndicator(),
            ),
        );
    }
}