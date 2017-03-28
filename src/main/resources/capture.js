var capture = function() {
    var root = document.documentElement;
    var canvas = document.createElementNS('http://www.w3.org/1999/xhtml', 'html:canvas');
    var context = canvas.getContext('2d');
    var selection = {
        top: 0,
        left: 0,
        width: root.scrollWidth,
        height: root.scrollHeight,
    };

    canvas.height = selection.height;
    canvas.width = selection.width;

    context.drawWindow(
        window,
        selection.left,
        selection.top,
        selection.width,
        selection.height,
        'rgb(255, 255, 255)'
    );

    return canvas.toDataURL('image/png', '');
};