<%@ page import="java.io.PrintWriter" %>
<% 

String sid = request.getParameter("sid");
String nom = request.getParameter("nom");
String prenom = request.getParameter("prenom");
String email = request.getParameter("email");
String nba = request.getParameter("nba");
String nbo = request.getParameter("nbo");




%>
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
            background-color: rgb(237, 237, 238);
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




        .main_box {
            width: 100%;
            min-height: 600px;
            display: flex;
            flex-direction: row;
        }

        .side_nav {
            width: 15%;
            max-width: 200px;
            height: 600px;
        }

        .brows_box {
            width: 100%;
            height: 150px;
            padding-top: 30px;
            padding-left: 30px;
        }

        li {
            list-style: none;
        }

        a {
            text-decoration: none;
            color: black;
        }

        li>a {
            font-size: 1.2em;
        }

        h3 {
            font-size: 1.4em;
            margin-bottom: 10px;
            color: rgb(88, 88, 88);
        }

        .main_content {
            width: 85%;
            display: flex;
            flex-direction: column;

        }

        .banner {
            width: 75%;
            min-width: 400px;
            height: 250px;
            background-color: white;
            margin: auto;
            margin-top: 30px;
        }


        .book_cat_line {
            margin-top: 30px;
            width: 100%;
            height: 450px;
            padding-top: 10px;
            padding-left: 10px;
        }

        .books {
            width: 100%;
            height: 400px;
            display: flex;
            flex-direction: row;
            justify-content: space-around;
        }

        .bookbox {
            width: 250px;
            height: 400px;

        }

        .cover_img {
            width: 100%;
            height: 350px;
            max-height: 100%;
        }
        .booknum{
                    font-size: 1.2em;
        
        
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
            <div class="booknum">
            	<span><%= nba %></span> | <span><%= nbo %></span>
            	
            	</div>
            <div class="right_nav_space">
            	
                <div id="profile_nav">
                    <img src="./img_student/<%= prenom+sid+".jpg" %>" alt="prof-img" class="profile_img">
                    <span><%= nom +" "+ prenom %></span>

                </div>
                <div class="deconct_box">
                    <button class="deconect_btn">Deconnection</button>
                </div>
            </div>

        </div>
    </div>
    <div class="main_box">
        <div class="side_nav">
            <div class="brows_box">
                <h3>Brows</h3>
                <ul>
                    <li><a href="#">Top Books</a></li>
                    <li><a href="#">Discover</a></li>
                    <li><a href="#">Categories</a></li>
                </ul>
            </div>
            <div class="brows_box">
                <h3>Tour Books</h3>
                <ul>
                    <li><a href="#">Reading</a></li>
                    <li><a href="#">Favorie</a></li>
                    <li><a href="#">Historique</a></li>
                </ul>
            </div>



        </div>
        <div class="main_content">
            <div class="banner">
                <img src="./img_book/headerr.jpg" alt="banner" style="width:100% ;height:100%;">


            </div>
            <div class="book_cat_line">
                <h3>
                    Categorie 1 :
                </h3>
                <div class="books">
                    <div class="bookbox">
                        <img src="./img_book/cover1.jpg" class="cover_img">
                        <div style="text-align: center;height: 30px;margin-top: 8px;">
                            <h4> the king</h4>
                        </div>

                    </div>
                    <div class="bookbox">
                        <img src="./img_book/cover1.jpg" class="cover_img">
                        <div style="text-align: center;height: 30px;margin-top: 8px;">
                            <h4> the king</h4>
                        </div>

                    </div>
                    <div class="bookbox">
                        <img src="./img_book/cover1.jpg" class="cover_img">
                        <div style="text-align: center;height: 30px;margin-top: 8px;">
                            <h4> the king</h4>
                        </div>

                    </div>
                    <div class="bookbox">
                        <img src="./img_book/cover1.jpg" class="cover_img">
                        <div style="text-align: center;height: 30px;margin-top: 8px;">
                            <h4> the king</h4>
                        </div>

                    </div>
                </div>

            </div>


        </div>
    </div>



</body>

</html>