import 'package:flutter/material.dart';
import '../utils/shared.dart';
import 'login.dart';

class HomePage extends StatelessWidget {
    const HomePage({super.key});

    Future<void> _logout(BuildContext context) async {
        await SharedPrefs.removeLoginStatus();
        Navigator.pushReplacement(
            context,
            MaterialPageRoute(builder: (context) => const LoginPage())
        );
    }

    @override
    Widget build(BuildContext context) {
        return Scaffold(
            appBar: AppBar(
                title: const Text('Página Principal'),
                actions: [
                    IconButton(
                        onPressed: () => _logout(context), 
                        icon: const Icon(Icons.logout)
                    )
                ],
            ),
            body: const Center(
                child: Text(
                    'Bem-vindo! :3',
                    style: TextStyle(fontSize: 32),
                ),
            ),
        );
    }
}