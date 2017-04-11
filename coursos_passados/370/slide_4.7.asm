.data
# String constants for messages
pr1:   .asciiz   "Please enter a string: " 
pr2:   .asciiz   "You entered: "
msg:   .asciiz   "Congratulations, SPIMmer!\n"
 
# Space for the input string 
buf:   .space    200

##################### Program Code ######################

.text
       .globl  main
main:
# Request a string.
       # Issue a prompt and read a string.
       li      $v0, 4                  # Print a string.
       la      $a0, pr1                # Prompt 1
       syscall
       li      $v0, 8                  # Read a string.
       la      $a0, buf                # Buffer
       li      $a1, 200                # Length of buffer
       syscall

# Print the entered string and a message.
       li      $v0, 4                  # Print a string.
       la      $a0, pr2                # Prompt 2
       syscall
       li      $v0, 4                  # Print a string.
       la      $a0, buf                # Buffer
       syscall
       li      $v0, 4                  # Print a string.
       la      $a0, msg                # Message
       syscall

# Exit the program.
       li      $v0, 10                 # Exit.
       syscall