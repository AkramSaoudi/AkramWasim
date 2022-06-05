<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>index</title>
        <style>
            * {
                margin: 0%;
                padding: 0%;
            }

            html,
            body {
                width: 100%;
                background-color: rgb(209, 213, 216);
                min-width: 1000px;
                min-height: 650px;
            }

            .navbar {
                width: 100%;
                height: 70px;
                display: flex;
                flex-direction: row;
                align-items: center;
                background-color: white;
            }

            .navbarcontent {
                width: 95%;
                margin: auto;
                min-width: 900px;
                display: flex;
                flex-direction: row;
                align-items: center;
                justify-content: space-between;
            }

            .left_nav_space {
                display: flex;
                flex-direction: row;
                align-items: center;
                width: 500px;
            }

            .logo {
                margin-left: 20px;
                color: rgb(5, 244, 117);
            }

            form {
                display: flex;
                flex-direction: row;
                align-items: center;
            }

            #rechercheinput {
                width: 250px;
                height: 25px;
                margin-left: 30px;
            }

            .recherche_icon {
                width: 29px;
                height: 29px;
                background-color: rgb(5, 244, 117);
                border-radius: 0px 10px 10px 0px;
                display: flex;
                flex-direction: row;
                align-items: center;
                justify-content: center;
                color: aliceblue;
            }

            .right_nav_space {
                display: flex;
                flex-direction: row;
                align-items: center;
                justify-content: flex-end;
                width: 500px;

            }



            #profile_nav {
                width: 160px;
                height: 100%;
                display: flex;
                flex-direction: row;
                align-items: center;
                justify-content: space-around;
                margin-right: 40px;
            }

            .profile_img {
                width: 40px;
                height: auto;
            }

            .deconct_box {
                width: 100px;
                height: 100%;
                display: flex;
                flex-direction: row;
                align-items: center;
                justify-content: center;

            }

            .deconect_btn {
                width: 90px;
                height: 30px;
                background-color: rgb(40, 40, 40);
                color: white;
                border: none;
            }
        </style>
    </head>

    <body>
        <div class="navbar">
            <div class="navbarcontent">
                <div class="left_nav_space">
                    <h2 class="logo">BIBLIO</h2>
                    <form action="" method="post">
                        <input type="text" name="recherche" id="rechercheinput">
                        <div class="recherche_icon"><span>R</span></div>
                    </form>
                </div>
                <div class="right_nav_space">
                    <div id="profile_nav">
                        <img src="./img_student/wassimp.jpg" alt="prof-img" class="profile_img">
                        <span>Wassim Chergui</span>

                    </div>
                    <div class="deconct_box">
                        <button class="deconect_btn">Deconnection</button>
                    </div>
                </div>

            </div>


        </div>


    </body>

    </html>