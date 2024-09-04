const fs = require ('fs');
const path = require('path');

const createFile = (name, data, callback) => {
    fs.writeFile (path.join(__dirname, name), data, callback)
}

const funcCreateFile = (req, res) => {
    let body = '';

    req.on('data', chunk => {
        body += chunk.toString();
    })

    req.on('end', () => {
        const {name, content} = JSON.parse(body);
        createFile(`${name}.txt`, content, (err) => {
            if (err) {
                res.writeHead(500, {'Content-Type': 'text/plain'});
                res.end('Erro galadinho');
                return;
            }
            res.writeHead(201, {'Content-Type': 'text/plain'});
            res.end('Arquivo galado com sucesso');
        })
    })
}