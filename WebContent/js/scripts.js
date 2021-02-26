$(document).ready(function() {
	$(".delete").click(function() {
		var radios = document.getElementsByName("radioNoLabel");
		for (var i = 0; i < radios.length; i++) {
			if (radios[i].checked) {
				window.location.href = "user?action=delete&id=" + radios[i].value;
			}
		}
	})
});

$(document).ready(function() {
	$(".update").click(function() {
		var radios = document.getElementsByName("radioNoLabel");
		for (var i = 0; i < radios.length; i++) {
			if (radios[i].checked) {
				window.location.href = "user?action=edit&id=" + radios[i].value;
			}
		}
	})
});

$(document).ready(function() {
	$('.toast').toast('show');
});