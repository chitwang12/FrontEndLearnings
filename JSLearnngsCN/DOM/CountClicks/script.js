  // Get references to the box and counter elements
  const box = document.getElementById("box");
  const counter = document.getElementById("counter");

  // Initialize the click count
  let clickCount = 0;

  // Function to update the counter on click
  function handleClick() {
    clickCount++;
    counter.textContent = `Box Clicked ${clickCount} times`;

    // Change the counter text after 5 clicks
    if (clickCount === 5) {
      counter.textContent = "Box Clicked 5 times";
    }
  }

  // Add a click event listener to the box
  box.addEventListener("click", handleClick);