
document.addEventListener("DOMContentLoaded", function () {

    // =========================
    // BUTTON CLICK EFFECT
    // =========================

    const buttons = document.querySelectorAll(".btn");

    buttons.forEach(function (button) {

        button.addEventListener("click", function () {

            button.style.transform = "scale(0.98)";

            setTimeout(function () {
                button.style.transform = "";
            }, 150);

        });

    });


    // =========================
    // SOCIAL LINKS
    // =========================

    const socialLinks = document.querySelectorAll(".social a");

    socialLinks.forEach(function (link) {

        link.addEventListener("click", function (event) {

            if (link.getAttribute("href") === "#") {

                event.preventDefault();

                alert("ضع رابط حسابك هنا");

            }

        });

    });


    // =========================
    // PAGE LOADED
    // =========================

    document.body.classList.add("loaded");

});
