import nodemailer from 'nodemailer';
import Mailgen from 'mailgen';

import ENV from '../konfigurasi.js';


// https://ethereal.email/create
let nodeConfig = {
    host: "smtp.gmail.com",
    port: 587,
    
    secure: false, // true for 465, false for other ports
    auth: {
        user: ENV.EMAIL, // generated ethereal user
        pass: ENV.PASSWORD, // generated ethereal password
    }
}

let transporter = nodemailer.createTransport(nodeConfig);

let MailGenerator = new Mailgen({
    theme: "default",
    product : {
        name: "Mailgen",
        link: 'https://mailgen.js/'
    }
})

/** POST: http://localhost:8080/api/registerMail 
 * @param: {
  "username" : "example123",
  "userEmail" : "admin123",
  "text" : "",
  "subject" : "",
}
*/
export const registerMail = async (req, res) => {
    const { username, userEmail, text, subject } = req.body;

    // body of the email
    var email = {
        body : {
            name: username,
            intro : text || 'Selamat datang Di Aplikasi kami!\'terimakasih karena telah memilih aplikasi kami.',
            outro: 'jika butuh bantuan atau pertanyaan silahkan bales email ini dengan sopan dan santtun\'Terimakasih'
        }
    }

    var emailBody = MailGenerator.generate(email);

    let message = {
        from : ENV.EMAIL,
        to: userEmail,
        subject : subject || "Selamat!Register Berhasil!",
        html : emailBody
    }

    // send mail
    transporter.sendMail(message)
        .then(() => {
            return res.status(200).send({ msg: "Selamat bergabung! silahkan cek email anda untuk pesan pertama dari kami."})
        })
        .catch(error => res.status(500).send({ error }))

}