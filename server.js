import express from 'express';
import cors from 'cors';
import morgan from 'morgan';
import connect from './db/database.js';
import router from './routes/routes.js';

const app = express();

/** middlewares */
app.use(express.json());
app.use(cors());
app.use(morgan('tiny'));
app.disable('x-powered-by'); // less hackers know about our stack


const port = 8000;

/** HTTP GET Request */
app.get('/', (req, res) => {
    res.status(201).json("Halaman Beranda dengan Method GET");
});


/** api routes */
app.use('/gloapp', router)

/** start server only when we have valid connection */
connect().then(() => {
    try {
        app.listen(port, () => {
            console.log(`Server connected to http://localhost:${port}`);
        })
    } catch (error) {
        console.log('Tidak dapat terkoneksi dengan server')
    }
}).catch(error => {
    console.log("Database tidak terkoneksi!");
})

