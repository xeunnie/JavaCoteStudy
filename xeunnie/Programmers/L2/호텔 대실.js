function solution(book_time) {
    function timeToMinutes(time) {
        const parts = time.split(':');
        const hours = parseInt(parts[0], 10);
        const minutes = parseInt(parts[1], 10);
        return hours * 60 + minutes;
    }

    function convertBookings(book_time) {
        const converted = [];
        for (let i = 0; i < book_time.length; i++) {
            const start = timeToMinutes(book_time[i][0]);
            const end = timeToMinutes(book_time[i][1]) + 10;
            converted.push([start, end]);
        }
        return converted;
    }

    function sortBookings(bookings) {
        bookings.sort((a, b) => a[0] - b[0]);
    }

    function calculateRooms(bookings) {
        const endTimes = [];
        for (let i = 0; i < bookings.length; i++) {
            const start = bookings[i][0];
            const end = bookings[i][1];

            let reused = false;
            for (let j = 0; j < endTimes.length; j++) {
                if (endTimes[j] <= start) {
                    endTimes[j] = end;
                    reused = true;
                    break;
                }
            }
            if (!reused) {
                endTimes.push(end);
            }
        }

        return endTimes.length;
    }

    const bookings = convertBookings(book_time);
    sortBookings(bookings);

    return calculateRooms(bookings);
}